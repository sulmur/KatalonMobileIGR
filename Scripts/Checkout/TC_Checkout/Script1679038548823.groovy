import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

'Tap tombol \'Checkout\''
Mobile.tap(findTestObject('Checkout/Checkout/Tombol Checkout'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/Checkout/Label Terima Kasih telah Belanja'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Checkout.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(0, 600, 0, 0)

Mobile.waitForElementPresent(findTestObject('Checkout/Checkout/Lihat Cara Pembayaran'), 0)

'Tap tombol \'Lihat cara pembayaran\''
Mobile.tap(findTestObject('Checkout/Checkout/Lihat Cara Pembayaran'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Lihat Cara Pembayaran.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(100, 600, 0, 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Lihat Cara Pembayaran Bawah.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap icon \'Back\' dari laman Lihat Cara Pembayaran'
Mobile.tap(findTestObject('Checkout/Checkout/Back Checkout'), 0)

