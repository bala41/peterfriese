//
//  TimersAndAnimationViewController.m
//  TimersAndAnimation
//
//  Created by Peter Friese on 30.07.09.
//  Copyright itemis 2009. All rights reserved.
//

#import <AudioToolbox/AudioServices.h>
#import "PomodoroViewController.h"
#import "PomodoroViewController_sm.h"

@implementation PomodoroViewController
@synthesize myCounterLabel;
@synthesize myIntervalLabel;
@synthesize startButton;

- (IBAction) doStartButton {
	[pomodoroStateMachine pressPomodoro];
}

- (void)updateCounter:(NSTimer*)theTimer {
	NSDate *now = [NSDate date];
	// NSTimeInterval interval = [now timeIntervalSinceDate:startTime];
	NSTimeInterval interval = [endTime timeIntervalSinceDate: now];
	
	if (interval >= 0) {
		NSInteger minutes = floor(interval / 60);
		NSInteger seconds = interval - minutes * 60;
		NSString *s = [[NSString alloc] initWithFormat:@"%i:%02i", minutes, seconds];		
		self.myCounterLabel.text = s;
		[s release];		
	}
	else if (interval < 0) {
		[pomodoroStateMachine timeOut];
	}
}

- (void)viewDidLoad {
    [super viewDidLoad];
	[startButton setImage:[UIImage imageNamed:@"tomato_3_small_bw.png"] forState:UIControlStateNormal];
	[self restoreAppState];	
}

- (void) restoreAppState {
	NSString *pomodoroPreferencesFile = [@"~/Library/Preferences/Pomodoro.plist" stringByExpandingTildeInPath];
	NSLog(@"Preferences file is %@", pomodoroPreferencesFile);
	
	NSMutableDictionary *pomodoroPreferences = [NSDictionary dictionaryWithContentsOfFile: pomodoroPreferencesFile];
	if (pomodoroPreferences) {
		
		// read the time this saved pomodoro is about to end
		endTime = [[pomodoroPreferences objectForKey: @"endTime"] retain];
		NSLog(@"End time is %@", endTime);
		NSDate *now = [NSDate date];
		NSTimeInterval interval = [endTime timeIntervalSinceDate: now];
		if (interval < 0) {
			[endTime release];
			endTime = nil;
			NSLog(@"End time has passed");
		}
		
		// read the last state of the pomodoro timer
		NSString *stateName = [pomodoroPreferences objectForKey: @"state"];
		NSLog(@"Last state was: %@", stateName);
		
		// now put the state machine into that state again!		
		NSNumber *stateIdNumber = [pomodoroPreferences objectForKey: @"stateId"];
		int stateId = [stateIdNumber intValue];

		// this is not the right way to instantiate the state:
		PomodoroViewControllerState *state = [[PomodoroViewControllerState alloc] initWithName: stateName stateId: stateId];
		NSLog(@"Instantiated state: %@", [state name]);
		state = [PomodoroFSM_Running alloc];
		pomodoroStateMachine = [[[PomodoroViewControllerContext alloc] initWithOwner:self state: state] retain];
		[pomodoroStateMachine setDebugFlag:YES];
	}
	else {
		NSLog(@"No started time as of yet");
	}
}

- (void) saveAppState {
	// get current state of state machine
	PomodoroViewControllerState *state = [pomodoroStateMachine state];
	NSNumber *stateIdNumber = [NSNumber numberWithInt: [state stateId]];
	
	// save state to preferences
	NSMutableDictionary *pomodoroPreferences = [[NSMutableDictionary alloc] init];
	[pomodoroPreferences setObject: [state name] forKey: @"state"];
	[pomodoroPreferences setObject: stateIdNumber forKey: @"stateId"];	
	[pomodoroPreferences setObject: endTime forKey: @"endTime"];
	
	
	// store to preference file
	NSString *pomodoroPreferencesFile = [@"~/Library/Preferences/Pomodoro.plist" stringByExpandingTildeInPath];
	NSLog(@"Preferences path is %@", pomodoroPreferencesFile);
	[pomodoroPreferences writeToFile: pomodoroPreferencesFile atomically: YES];
}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning]; // Releases the view if it doesn't have a superview
    // Release anything that's not essential, such as cached data
}

- (void)dealloc {
	[self saveAppState];
	[pomodoroStateMachine release];
	[endTime release];
    [super dealloc];
}

- (void) startTimer:(int) minutes {
	if (endTime) {
	}
	else {
		NSTimeInterval pomodoroInterval = minutes * 60;
		endTime = [[NSDate dateWithTimeIntervalSinceNow: pomodoroInterval] retain];		
		[self saveAppState];
	}
	
	NSDate *fireDate = [NSDate dateWithTimeIntervalSinceNow: 0];
	timer = [[NSTimer alloc] initWithFireDate: fireDate interval: 1.0f target:self selector:@selector(updateCounter:) userInfo:nil repeats:YES];
	NSRunLoop *runLoop = [NSRunLoop currentRunLoop];
	[runLoop addTimer:timer	forMode:NSDefaultRunLoopMode];	
}

- (void) stopTimer {
	[timer invalidate];	
	[endTime release];
	endTime = nil;
}

- (void) pomodoroRed {
	[startButton setImage:[UIImage imageNamed:@"tomato_3_small.png"] forState:UIControlStateNormal];
}

- (void) pomodoroGray {
	[startButton setImage:[UIImage imageNamed:@"tomato_3_small_bw.png"] forState:UIControlStateNormal];
	self.myCounterLabel.text = @"press to start";	
}

- (void) pomodoroGreen {
	[startButton setImage:[UIImage imageNamed:@"tomato_3_small_green.png"] forState:UIControlStateNormal];	
}

- (void) wellDone {
	self.myCounterLabel.text = @"well done!";	
}

- (void) welcome {
	self.myCounterLabel.text = @"press to start";
}

- (void) ring {
	NSString *soundPath = [[NSBundle mainBundle] pathForResource: @"ring" ofType: @"wav"];
	SystemSoundID soundID;
	AudioServicesCreateSystemSoundID((CFURLRef)[NSURL fileURLWithPath: soundPath], &soundID);
	AudioServicesPlayAlertSound (soundID);
	[soundPath release];		
}	

@end
