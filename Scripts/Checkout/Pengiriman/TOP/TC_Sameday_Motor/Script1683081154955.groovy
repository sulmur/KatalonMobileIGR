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

'Tap icon \'panah ke atas\''
Mobile.tap(findTestObject('Checkout/Keranjang/Rincian Promosi/Panah Ke atas Rincian Promosi'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/Pengiriman/NEW Tombol Pengiriman'), 0)

'Tap tombol \'Pengiriman\''
Mobile.tap(findTestObject('Checkout/Pengiriman/NEW Tombol Pengiriman'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/Pembayaran/Tombol Pembayaran'), 0)

'Tap tombol \'Pembayaran\''
Mobile.tap(findTestObject('Checkout/Pembayaran/Tombol Pembayaran'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Belum pilih pengiriman.png', FailureHandling.CONTINUE_ON_FAILURE)

'Scroll ke bawah'
Mobile.swipe(0, 600, 0, 0)

Mobile.waitForElementPresent(findTestObject('Checkout/Pengiriman/TOP/SAMEDAY Motor TOP'), 0)

'Tap opsi pengiriman \'Sameday Motor\''
Mobile.tap(findTestObject('Checkout/Pengiriman/TOP/SAMEDAY Motor TOP'), 0)

'Tap tombol \'Pembayaran\''
Mobile.tap(findTestObject('Checkout/Pembayaran/Tombol Pembayaran'), 0)

Mobile.delay(6, FailureHandling.CONTINUE_ON_FAILURE)

