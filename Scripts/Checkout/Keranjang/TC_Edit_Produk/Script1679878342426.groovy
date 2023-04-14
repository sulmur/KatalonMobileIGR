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

'Tap jumlah produk'
Mobile.tap(findTestObject('Checkout/Keranjang/Edit Produk/Edit Jumlah Produk Row 1 Jumlah 3'), 0)

'Tap field \'Jumlah produk\''
Mobile.tap(findTestObject('Checkout/Keranjang/Edit Produk/Field Edit Produk 3 Khong Guan'), 0)

'Input data angka jumlah produk'
Mobile.setText(findTestObject('Checkout/Keranjang/Edit Produk/Field Edit Produk 3 Khong Guan'), '10', 0)

'Tap tombol \'Simpan\' pada pop-up Edit Produk'
Mobile.tap(findTestObject('Checkout/Keranjang/Edit Produk/Simpan Edit Produk'), 0)

