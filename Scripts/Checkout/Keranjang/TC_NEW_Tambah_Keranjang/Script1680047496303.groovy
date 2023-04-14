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

Mobile.startApplication(GlobalVariable.APP, false)

'Tap Jenis Kategori \'Ibu & Anak\''
Mobile.tap(findTestObject('Kategori/Ibu dan Anak'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Tap tombol \'Sort\''
Mobile.tap(findTestObject('Sorting/Tombol Sort'), 0)

'Tap opsi \'Harga Termahal\''
Mobile.tap(findTestObject('Sorting/Harga Termahal'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(100, 400, 0, 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'+ Keranjang\' pada salah satu produk kategori Ibu & Anak'
Mobile.tap(findTestObject('Kategori/Ibu_Anak/Tambah Keranjang Enfagrow Susu 800g'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap icon \'+\' untuk menambah jumlah produk'
Mobile.tap(findTestObject('Kategori/Ibu_Anak/Tambah Produk'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'+ Keranjang\' untuk menambah produk ke menu Keranjang'
Mobile.tap(findTestObject('Kategori/Ibu_Anak/Tambah Keranjang'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Tap icon \'Keranjang\' untuk masuk ke menu \'Keranjang\''
Mobile.tap(findTestObject('Kategori/Ibu_Anak/Keranjang Ibu dan Anak 1'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

