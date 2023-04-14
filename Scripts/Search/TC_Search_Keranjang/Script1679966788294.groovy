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

'Tap icon \'Keranjang\' pada menu Search'
Mobile.tap(findTestObject('Search/Tambah Keranjang'), 0)

'Tap icon \'-\''
Mobile.tap(findTestObject('Search/Keranjang/Edit Produk/Kurangi Produk 1'), 0)

'Tap tombol \'Perbaharui\''
Mobile.tap(findTestObject('Search/Keranjang/Edit Produk/Perbaharui'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap icon \'+\''
Mobile.tap(findTestObject('Search/Keranjang/Edit Produk/Tambah Produk 1'), 0)

'Tap tombol \'Perbaharui\''
Mobile.tap(findTestObject('Search/Keranjang/Edit Produk/Perbaharui'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap \'Jumlah produk\' pada baris pertama'
Mobile.tap(findTestObject('Search/Keranjang/Edit Produk/Edit Produk 1'), 0)

'Tap Field \'Edit Produk\''
Mobile.tap(findTestObject('Search/Keranjang/Edit Produk/Field Edit Produk'), 0)

'Input data pada field \'Edit Produk\''
Mobile.setText(findTestObject('Search/Keranjang/Edit Produk/Field Edit Produk'), '4', 0)

'Tap tombol \'Simpan\' edit produk'
Mobile.tap(findTestObject('Search/Keranjang/Edit Produk/Simpan Edit Produk'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Perbaharui\''
Mobile.tap(findTestObject('Search/Keranjang/Edit Produk/Perbaharui'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

