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

Mobile.startApplication(GlobalVariable.APP, false)

Mobile.waitForElementPresent(findTestObject('Kategori/Minuman'), 0)

'Tap menu \'Pesanan\''
Mobile.tap(findTestObject('Pesanan/Menu Pesanan'), 0)

'Tap Detail pesanan dengan status "Diproses"'
Mobile.tap(findTestObject('Pesanan/Tracking Pesanan/Detail Pesanan Diproses'), 0)

Mobile.waitForElementPresent(findTestObject('Pesanan/Detail Pesanan/Label Detail Pengiriman'), 0)

Mobile.swipe(0, 600, 0, 0)

Mobile.waitForElementPresent(findTestObject('Pesanan/Tracking Pesanan/Lacak Pesanan'), 0)

'Tap "Lacak Pesanan"'
Mobile.tap(findTestObject('Pesanan/Tracking Pesanan/Lacak Pesanan'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Tracking Pesanan.png', FailureHandling.STOP_ON_FAILURE)
