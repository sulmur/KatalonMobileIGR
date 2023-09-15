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

Mobile.startExistingApplication(GlobalVariable.APP_EXIST, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Kategori/Minuman'), 0)

if (Mobile.waitForElementPresent(findTestObject('Homepage/Pesan Ulang'), 0)) {
    'Tap tombol \'Pesan Ulang\''
    Mobile.tap(findTestObject('Homepage/Pesan Ulang'), 0, FailureHandling.OPTIONAL)
} else {
    Mobile.swipe(0, 300, 0, 0, FailureHandling.OPTIONAL)

    Mobile.delay(2, FailureHandling.OPTIONAL)

    'Tap tombol "Pesan Ulang" pada homepage'
    Mobile.tap(findTestObject('Homepage/Pesan Ulang Down'), 0, FailureHandling.OPTIONAL)
}

Mobile.waitForElementPresent(findTestObject('Homepage/Tutup Pop-up Pesan Ulang'), 0)

'Tap tombol "Tutup" pada pop-up berhasil pesan ulang'
Mobile.tap(findTestObject('Homepage/Tutup Pop-up Pesan Ulang'), 0)

Mobile.tap(findTestObject('Favourite/Menu Favorit'), 0)

Mobile.tap(findTestObject('Favourite/Filter/Filter Button'), 0)

Mobile.tap(findTestObject('Checkout/Keranjang/Case Potongan Pengiriman/Dji Sam Soe/Filter Dji Sam Soe'), 0)

Mobile.tap(findTestObject('Filter/Tombol Terapkan'), 0)

Mobile.tap(findTestObject('Checkout/Keranjang/Case Potongan Pengiriman/Dji Sam Soe/Tambah Produk 234'), 0)

Mobile.tap(findTestObject('Checkout/Keranjang/Case Potongan Pengiriman/Dji Sam Soe/Plus Produk'), 0)

Mobile.tap(findTestObject('Checkout/Keranjang/Case Potongan Pengiriman/Dji Sam Soe/Tambah Detail Produk 234'), 0)

'Tap tombol icon "Keranjang" pada homepage'
Mobile.tap(findTestObject('Favourite/Keranjang Favourite 2'), 0)

Mobile.waitForElementPresent(findTestObject('Checkout/Pengiriman/NEW Tombol Pengiriman'), 0)

