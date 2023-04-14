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

'Tap tombol \'Hapus\' pada salah satu produk'
Mobile.tap(findTestObject('Checkout/Keranjang/Icon Hapus Produk'), 10)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'checklist hapus produk baris 1'
Mobile.tap(findTestObject('Checkout/Keranjang/Checklist Hapus Produk 1'), 10)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'checklist hapus produk baris 2'
Mobile.tap(findTestObject('Checkout/Keranjang/Checklist Hapus Produk 2'), 10)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap \'Hapus\' pada bagian navbar'
Mobile.tap(findTestObject('Checkout/Keranjang/Setuju Hapus Checklist Produk'), 10)

'Tap \'Ya\' pada pop-up konfirmasi hapus produk'
Mobile.tap(findTestObject('Checkout/Keranjang/Setuju Hapus Produk'), 10)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('Hapus semua produk.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

