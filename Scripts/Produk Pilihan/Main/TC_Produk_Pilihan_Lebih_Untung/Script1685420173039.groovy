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

'Tap menu "Akun"'
Mobile.tap(findTestObject('Profil/Profil_Button/Menu Akun'), 0)

Mobile.waitForElementPresent(findTestObject('Profil/Alamat_Penerima/Alamat_Button/Menu Kelola Alamat Penerima'), 0)

'Tap menu \'Kelola Alamat Penerima\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Alamat_Button/Menu Kelola Alamat Penerima'), 0)

Mobile.waitForElementPresent(findTestObject('Profil/Alamat_Penerima/Ganti_Alamat/Pilih Alamat 2'), 0)

'Tap tombol \'Pilih Alamat\' pada baris kedua'
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Ganti_Alamat/Pilih Alamat 2'), 0)

'Tap tombol back'
Mobile.pressBack()

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Profil/Alamat_Penerima/Alamat_Button/Menu Kelola Alamat Penerima'), 0)

'Tap menu \'Home\''
Mobile.tap(findTestObject('Homepage/Menu Home'), 0)

Mobile.swipe(0, 400, 0, 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(760, 1000, 0, 1000)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap \'Tambah Keranjang\' pada produk pilihan dengan tag \'lebih untung\''
Mobile.tap(findTestObject('Produk Pilihan/Produk Lebih Untung/Tambah Keranjang Lebih Untung'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/Tambah_Keranjang/Icon_Keranjang/Pop-up Harga Termurah'), 20)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Tambah Keranjang Lebih Untung.png')

'Tap tombol \'Cancel\''
Mobile.tap(findTestObject('Produk Pilihan/Produk Lebih Untung/Cancel Keranjang Lebih Untung'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap gambar produk pilihan dengan tag lebih untung'
Mobile.tap(findTestObject('Produk Pilihan/Produk Lebih Untung/Mie Sedaap Lebih Untung'), 0)

Mobile.waitForElementPresent(findTestObject('Produk Pilihan/Produk Sejenis/Tab Promosi'), 20)

Mobile.swipe(100, 425, 0, 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Lebih Untung.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profil/Alamat_Penerima/TC_Reset_Pilih_Alamat'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

