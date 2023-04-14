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

'Tap Jenis Kategori \'Lebaran 2023\''
Mobile.tap(findTestObject('Object Repository/Checkout/Tambah_Keranjang/Tambah_Produk/android.widget.ImageView'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

'Tap tombol \'+ Keranjang\' pada produk \'Monde Biskuit Butter Cookies KLG 454g\''
Mobile.tap(findTestObject('Object Repository/Checkout/Tambah_Keranjang/Tambah_Produk/android.widget.Button'), 0)

'Tap icon \'+\' untuk menambah jumlah produk'
Mobile.tap(findTestObject('Object Repository/Checkout/Tambah_Keranjang/Tambah_Produk/android.widget.Button (1)'), 0)

'Tap icon \'+\' untuk menambah jumlah produk'
Mobile.tap(findTestObject('Checkout/Tambah_Keranjang/Tambah_Produk/android.widget.Button (1)'), 0)

'Tap tombol \'+ Keranjang\' untuk menambah produk ke menu Keranjang'
Mobile.tap(findTestObject('Object Repository/Checkout/Tambah_Keranjang/Tambah_Produk/android.view.View'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

'Tap icon \'Keranjang\' untuk masuk ke menu \'Keranjang\''
Mobile.tap(findTestObject('Checkout/Tambah_Keranjang/Icon_Keranjang/android.widget.Button'), 0)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

