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

Mobile.waitForElementPresent(findTestObject('Pesanan/Detail Pesanan Selesai'), 0)

'Tap "Detail Pesanan" yang sudah selesai'
Mobile.tap(findTestObject('Pesanan/Detail Pesanan Selesai'), 0)

Mobile.waitForElementPresent(findTestObject('Pesanan/Ulasan/Beri Ulasan'), 0)

'Tap "Biasa"'
Mobile.tap(findTestObject('Pesanan/Ulasan/Biasa'), 0)

'Tap "Puas"'
Mobile.tap(findTestObject('Pesanan/Ulasan/Puas'), 0)

'Tap "Kecewa"'
Mobile.tap(findTestObject('Pesanan/Ulasan/Kecewa'), 0)

'Tap opsi "Harga Barang"'
Mobile.tap(findTestObject('Pesanan/Ulasan/Harga Barang'), 0)

'Tap opsi "Kualitas Barang"'
Mobile.tap(findTestObject('Pesanan/Ulasan/Kualitas Barang'), 0)

'Tap opsi "Pengiriman"'
Mobile.tap(findTestObject('Pesanan/Ulasan/Pengiriman'), 0)

'Tap field "Alasan"'
Mobile.tap(findTestObject('Pesanan/Ulasan/Field Alasan'), 0)

'Input field "Alasan"'
Mobile.setText(findTestObject('Pesanan/Ulasan/Field Alasan'), 'Barang tidak sesuai', 0)

Mobile.hideKeyboard()

'Tap "Kirim"'
Mobile.tap(findTestObject('Pesanan/Ulasan/Kirim Ulasan'), 0)

Mobile.waitForElementPresent(findTestObject('Pesanan/Ulasan/Tutup Pop-up Ulasan'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Berhasil Beri Ulasan.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap "Tutup"'
Mobile.tap(findTestObject('Pesanan/Ulasan/Tutup Pop-up Ulasan'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

