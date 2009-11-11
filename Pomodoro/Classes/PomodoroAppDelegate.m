//
//  TimersAndAnimationAppDelegate.m
//  TimersAndAnimation
//
//  Created by Peter Friese on 30.07.09.
//  Copyright itemis 2009. All rights reserved.
//

#import "PomodoroAppDelegate.h"
#import "PomodoroViewController.h"

@implementation PomodoroAppDelegate

@synthesize window;
@synthesize viewController;


- (void)applicationDidFinishLaunching:(UIApplication *)application {
	[[UIApplication sharedApplication] setIdleTimerDisabled: YES];
    [window addSubview:viewController.view];
    [window makeKeyAndVisible];
}

- (void)dealloc {
	[[UIApplication sharedApplication] setIdleTimerDisabled: NO];
    [viewController release];
    [window release];
    [super dealloc];
}


@end
