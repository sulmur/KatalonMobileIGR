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

'Tap dropdown \'Daftar Transaksi\''
Mobile.tap(findTestObject('Pesanan/Dropdown Transaksi'), 0)

'Pilih status \'Pengembalian\''
Mobile.tap(findTestObject('Pesanan/Status Pesanan/Pengembalian'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap dropdown \'Daftar Transaksi\''
Mobile.tap(findTestObject('Pesanan/Dropdown/Dropdown Pengembalian'), 0)

'Pilih status \'Dibatalkan\''
Mobile.tap(findTestObject('Pesanan/Status Pesanan/Dibatalkan'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap dropdown \'Daftar Transaksi\''
Mobile.tap(findTestObject('Pesanan/Dropdown/Dropdown Dibatalkan'), 0)

'Pilih status \'Selesai\''
Mobile.tap(findTestObject('Pesanan/Status Pesanan/Selesai'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap dropdown \'Daftar Transaksi\''
Mobile.tap(findTestObject('Pesanan/Dropdown/Dropdown Selesai'), 0)

'Pilih status \'Diproses\''
Mobile.tap(findTestObject('Pesanan/Status Pesanan/Diproses'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap dropdown \'Daftar Transaksi\''
Mobile.tap(findTestObject('Pesanan/Dropdown/Dropdown Diproses'), 0)

'Pilih status \'Belum Bayar\''
Mobile.tap(findTestObject('Pesanan/Status Pesanan/Belum Bayar'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap dropdown \'Daftar Transaksi\''
Mobile.tap(findTestObject('Pesanan/Dropdown/Dropdown Belum Bayar'), 0)

'Pilih status \'Semua Transaksi\''
Mobile.tap(findTestObject('Pesanan/Status Pesanan/Semua Transaksi'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(100, 700, 0, 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

