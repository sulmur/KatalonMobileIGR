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

'Tap panah ke atas untuk membuka ringkasan belanja'
Mobile.tap(findTestObject('Checkout/Keranjang/Panah Ke atas Ringkasan Belanja'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Rincian Promosi\''
Mobile.tap(findTestObject('Checkout/Keranjang/Rincian Promosi/Rincian Promosi'), 0)

Mobile.takeScreenshot('RIncian Promosi.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Back\' pada Rincian Promosi'
Mobile.tap(findTestObject('Checkout/Keranjang/Rincian Promosi/Back Rincian Promosi'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Dropdown\' untuk hide Ringkasan Belanja '
Mobile.tap(findTestObject('Checkout/Keranjang/Rincian Promosi/Dropdown Ringkasan Belanja'), 0)

