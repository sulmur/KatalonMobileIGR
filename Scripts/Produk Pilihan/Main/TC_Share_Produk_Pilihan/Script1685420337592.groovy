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

Mobile.callTestCase(findTestCase('Produk Pilihan/TC_Cek_Produk_Pilihan'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap icon "Wishlist"'
Mobile.tap(findTestObject('Produk Pilihan/Icon Wishlist'), 0)

'Tap kembali icon "Wishlist"'
Mobile.tap(findTestObject('Produk Pilihan/Icon Wishlist'), 0)

'Tap icon "Share"'
Mobile.tap(findTestObject('Produk Pilihan/Icon Share Produk'), 0)

Mobile.waitForElementPresent(findTestObject('Produk Pilihan/Share Produk/Share 4'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Share Produk Pilihan.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap icon "Share Whatsapp"'
Mobile.tap(findTestObject('Produk Pilihan/Share Produk/Share 4'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Share Whatsapp.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

