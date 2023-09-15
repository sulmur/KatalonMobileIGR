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

Mobile.callTestCase(findTestCase('Produk Pilihan/TC_Cek_Produk_Pilihan'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap jumlah produk'
Mobile.tap(findTestObject('Produk Pilihan/Edit Jumlah Produk 1'), 0)

Mobile.waitForElementPresent(findTestObject('Produk Pilihan/Field Edit Jumlah Produk 1'), 0)

'Tap field "Jumlah Produk"'
Mobile.tap(findTestObject('Produk Pilihan/Field Edit Jumlah Produk 1'), 0)

'Input jumlah produk'
Mobile.setText(findTestObject('Produk Pilihan/Field Edit Jumlah Produk 1'), '10', 0)

'Tap tombol "Simpan" jumlah produk'
Mobile.tap(findTestObject('Produk Pilihan/Simpan Edit Produk'), 0)

'Tap icon "Tambah" pada produk pilihan'
Mobile.tap(findTestObject('Produk Pilihan/Tambah Jumlah Produk'), 0)

'Tap icon "Kurang" pada produk pilihan'
Mobile.tap(findTestObject('Produk Pilihan/Kurangi Jumlah Produk'), 0)

'Tap tombol "Tambah Keranjang" pada produk pilihan'
Mobile.tap(findTestObject('Produk Pilihan/Tambah Keranjang Pilihan'), 0)

Mobile.waitForElementPresent(findTestObject('Produk Pilihan/Keranjang Pilihan 1'), 0)

'Tap tombol "Keranjang" pada laman Produk Pilihan'
Mobile.tap(findTestObject('Produk Pilihan/Keranjang Pilihan 1'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/Pengiriman/NEW Tombol Pengiriman'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Keranjang Produk Pilihan.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Checkout/Pengiriman/TC_Nextday_Mobil'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Checkout/Pembayaran/TC_Bayar_Tunai'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Checkout/TC_Checkout_Tunai'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

