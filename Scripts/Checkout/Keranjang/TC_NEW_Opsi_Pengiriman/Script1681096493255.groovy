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

'Tap kategori \'Kesehatan & Kecantikan\''
Mobile.tap(findTestObject('Kategori/Kesehatan dan Kecantikan'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap \'+ Keranjang\' Produk Lifebuoy pada laman Kategori'
Mobile.tap(findTestObject('Checkout/Tambah_Keranjang/Tambah Produk Lifebuoy'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap \'+ Keranjang\' Produk Lifebuoy'
Mobile.tap(findTestObject('Checkout/Tambah_Keranjang/Produk Pilihan/Tambah Keranjang Produk Pilihan'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap icon \'Keranjang\' pada laman Kategori'
Mobile.tap(findTestObject('Checkout/Tambah_Keranjang/Keranjang Kategori 1'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('Keranjang di bawah 150000.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap Edit jumlah Produk pada Lifebuoy yang berjumlah 1'
Mobile.tap(findTestObject('Checkout/Keranjang/Detail Produk/Edit Produk Row 1 Jumlah 1'), 0)

Mobile.tap(findTestObject('Checkout/Keranjang/Edit Produk/Field Edit Produk 1 Lifebuoy'), 0)

'Input data \'3\' pada field Edit Jumlah Produk'
Mobile.setText(findTestObject('Checkout/Keranjang/Edit Produk/Field Edit Produk 1 Lifebuoy'), '3', 0)

Mobile.tap(findTestObject('Checkout/Keranjang/Edit Produk/Simpan Edit Produk'), 0)

'tap \'Perbaharui\''
Mobile.tap(findTestObject('Checkout/Keranjang/Perbaharui Keranjang'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap Edit jumlah Produk pada Lifebuoy yang berjumlah 3'
Mobile.tap(findTestObject('Checkout/Keranjang/Edit Produk/Edit Jumlah Produk Row 1 Jumlah 3'), 0)

Mobile.tap(findTestObject('Checkout/Keranjang/Edit Produk/Field Edit Produk 3 Lifebuoy'), 0)

'Input data \'30\' pada field Edit Jumlah Produk'
Mobile.setText(findTestObject('Checkout/Keranjang/Edit Produk/Field Edit Produk 3 Lifebuoy'), '50', 0)

Mobile.tap(findTestObject('Checkout/Keranjang/Edit Produk/Simpan Edit Produk'), 0)

'tap \'Perbaharui\''
Mobile.tap(findTestObject('Checkout/Keranjang/Perbaharui Keranjang'), 0)

Mobile.takeScreenshot('Keranjang di atas 150000.png', FailureHandling.CONTINUE_ON_FAILURE)

'tap \'Pengiriman\''
Mobile.tap(findTestObject('Checkout/Pengiriman/Tombol Pengiriman'), 0)

Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(0, 600, 0, 0)

Mobile.takeScreenshot('Pengiriman di atas 150000.png', FailureHandling.CONTINUE_ON_FAILURE)

'tap icon \'Back\' untuk kembali ke laman Keranjang'
Mobile.tap(findTestObject('Checkout/Pengiriman/Back from Pengiriman'), 0)

