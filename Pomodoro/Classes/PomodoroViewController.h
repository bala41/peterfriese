//
//  TimersAndAnimationViewController.h
//  TimersAndAnimation
//
//  Created by Peter Friese on 30.07.09.
//  Copyright itemis 2009. All rights reserved.
//

#import <UIKit/UIKit.h>
#import <AudioToolbox/AudioServices.h>

@class PomodoroViewControllerContext;

@interface PomodoroViewController : UIViewController {
	IBOutlet UILabel *myCounterLabel;
	IBOutlet UILabel *myIntervalLabel;
	IBOutlet UIButton *startButton;
	NSDate *endTime;
	BOOL running;
	NSTimer *timer;
	PomodoroViewControllerContext *pomodoroStateMachine;
}
- (void) startTimer:(int) minutes;
- (void) stopTimer;
- (void) pomodoroRed;
- (void) pomodoroGray;
- (void) pomodoroGreen;
- (void) wellDone;
- (void) welcome;
- (void) ring;
- (void) restoreAppState;
- (void) saveAppState;

@property (nonatomic, retain) UILabel *myCounterLabel;
@property (nonatomic, retain) UILabel *myIntervalLabel;
@property (nonatomic, retain) UIButton *startButton;

- (IBAction) doStartButton;

@end

