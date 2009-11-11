//
//  TimersAndAnimationAppDelegate.h
//  TimersAndAnimation
//
//  Created by Peter Friese on 30.07.09.
//  Copyright itemis 2009. All rights reserved.
//

#import <UIKit/UIKit.h>

@class PomodoroViewController;

@interface PomodoroAppDelegate : NSObject <UIApplicationDelegate> {
    UIWindow *window;
    PomodoroViewController *viewController;
}

@property (nonatomic, retain) IBOutlet UIWindow *window;
@property (nonatomic, retain) IBOutlet PomodoroViewController *viewController;

@end

