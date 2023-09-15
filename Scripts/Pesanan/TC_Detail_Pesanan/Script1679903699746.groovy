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

'Tap detail pesanan pada baris pertama'
Mobile.tap(findTestObject('Pesanan/Detail Pesanan/Detail Pesanan 1'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap dropdown \'Daftar Produk\''
Mobile.tap(findTestObject('Pesanan/Detail Pesanan/Daftar Produk Pesanan'), 0)

Mobile.takeScreenshot('Reports/Detail Pesanan.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Tambah Keranjang\''
Mobile.tap(findTestObject('Pesanan/Detail Pesanan/Tambah Keranjang Pesanan'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'swipe ke bawah'
Mobile.swipe(100, 600, 0, 0)

Mobile.waitForElementPresent(findTestObject('Pesanan/Detail Pesanan/Pesan Ulang Pesanan'), 0)

'Tap tombol \'Pesan Ulang\''
Mobile.tap(findTestObject('Pesanan/Detail Pesanan/Pesan Ulang Pesanan'), 0)

'Tap tombol \'Tidak\' pada pop-up konfirmasi pesan ulang'
Mobile.tap(findTestObject('Pesanan/Detail Pesanan/Batal Pesan Ulang'), 0)

'Tap tombol \'Pesan Ulang\''
Mobile.tap(findTestObject('Pesanan/Detail Pesanan/Pesan Ulang Pesanan'), 0)

Mobile.waitForElementPresent(findTestObject('Pesanan/Detail Pesanan/Setuju Pesan Ulang'), 0)

'Tap tombol \'Ya\' pada pop-up konfirmasi pesan ulang'
Mobile.tap(findTestObject('Pesanan/Detail Pesanan/Setuju Pesan Ulang'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('Reports/Berhasil Pesan Ulang Pesanan.png', FailureHandling.CONTINUE_ON_FAILURE)

