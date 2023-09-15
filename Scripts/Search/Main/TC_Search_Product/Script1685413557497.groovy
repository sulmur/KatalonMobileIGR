import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Color as Color
import java.util.concurrent.ConcurrentHashMap.KeySetView as KeySetView
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startApplication(GlobalVariable.APP, false)

Mobile.waitForElementPresent(findTestObject('Search/Menu Search'), 20)

'Tap menu \'Search\''
Mobile.tap(findTestObject('Search/Menu Search'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Field Search'), 20)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

//Mobile.takeElementScreenshot(RunConfiguration.getReportFolder() + 'Field Search.png', findTestObject('Search/Field Search'), 
//    [findTestObject('Search/Keranjang Search')], Color.GREEN)
//Mobile.takeAreaScreenshot(RunConfiguration.getReportFolder() + 'Field Search.png', new Rectangle(0, 0, 1500, 1000), [findTestObject(
//            'Search/Back Search')], Color.BLUE)
'Tap field \'Search\''
Mobile.tap(findTestObject('Search/Field Search'), 10)

'Input data produk yang ingin dicari pada field \'Search\''
Mobile.setText(findTestObject('Search/Field Search'), 'dancow', 10)

'Tap \'Enter\' pada keyboard'
driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER)

Mobile.waitForElementPresent(findTestObject('Search/Tambah Keranjang Search 1'), 0)

Mobile.takeScreenshotAsCheckpoint('Search Success.png')

Mobile.tap(findTestObject('Search/Back Search'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Back Search.png')

Mobile.tap(findTestObject('Search/Search Back to Home'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

