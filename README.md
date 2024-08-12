Steps to execute the test:

1. Install the Appium Server.
2. Install the Appium UI Inspector.
3. Install the UIAutomator2
4. Connect Device through USB cable. Make sure that USB debugging is on.
5. Important commands:
	(A) adb shell pm list packages // get all the installed app's package name.
	(B) adb shell //start the sehll
	(C) dumpsys window displays | grep -E 'mCurrentFocus' // Get the opened app's package and activity

Other Tools/Framwork:
1. Selenium
2. TestNG
3. Eclipse
4. Maven


Required sample capabilities:

{
  "platformName": "Android",
  "appium:platformVersion": "13",
  "appium:deviceName": "R7KTA00EARD",
  "appium:appPackage": "com.sec.android.app.popupcalculator",
  "appium:appActivity": "com.sec.android.app.popupcalculator.Calculator",
  "appium:automationName": "UiAutomator2",
  "appium:ensureWebviewsHavePages": true,
  "appium:nativeWebScreenshot": true,
  "appium:newCommandTimeout": 3600,
  "appium:connectHardwareKeyboard": true
}
