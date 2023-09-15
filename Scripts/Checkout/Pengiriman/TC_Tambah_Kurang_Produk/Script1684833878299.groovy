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

def TigaProduk = Mobile.verifyElementExist(findTestObject('Checkout/Keranjang/Case Potongan Pengiriman/3 buah Khong Guan'), 
    1, FailureHandling.OPTIONAL)

def EmpatProduk = Mobile.verifyElementExist(findTestObject('Checkout/Keranjang/Case Potongan Pengiriman/4 buah Khong Guan'), 
    1, FailureHandling.OPTIONAL)

def EnamProduk = Mobile.verifyElementExist(findTestObject('Checkout/Keranjang/Case Potongan Pengiriman/6 buah Khong Guan'), 
    1, FailureHandling.OPTIONAL)

def TujuhProduk = Mobile.verifyElementExist(findTestObject('Checkout/Keranjang/Case Potongan Pengiriman/7 buah Khong Guan'), 
    1, FailureHandling.OPTIONAL)

def Rokok = Mobile.verifyElementExist(findTestObject('Checkout/Keranjang/Case Potongan Pengiriman/Dji Sam Soe/Gambar Rokok'), 
    1, FailureHandling.OPTIONAL)

if (TigaProduk && Rokok) {
    'Tap icon \'+\''
    Mobile.tap(findTestObject('Checkout/Keranjang/Tambah Produk'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    'Tap icon \'+\''
    Mobile.tap(findTestObject('Checkout/Keranjang/Tambah Produk'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    'Tap \'Perbaharui\''
    Mobile.tap(findTestObject('Checkout/Keranjang/NEW Perbaharui Keranjang'), 0, FailureHandling.CONTINUE_ON_FAILURE)
} else if (EnamProduk && Rokok) {
    'Tap icon \'-\''
    Mobile.tap(findTestObject('Checkout/Keranjang/Kurangi Produk'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    'Tap \'Perbaharui\''
    Mobile.tap(findTestObject('Checkout/Keranjang/NEW Perbaharui Keranjang'), 0, FailureHandling.CONTINUE_ON_FAILURE)
} else {
    if (EnamProduk || TujuhProduk) {
        'Tap icon \'-\''
        Mobile.tap(findTestObject('Checkout/Keranjang/Kurangi Produk'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        'Tap icon \'-\''
        Mobile.tap(findTestObject('Checkout/Keranjang/Kurangi Produk'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        'Tap icon \'-\''
        Mobile.tap(findTestObject('Checkout/Keranjang/Kurangi Produk'), 0, FailureHandling.CONTINUE_ON_FAILURE)

        'Tap \'Perbaharui\''
        Mobile.tap(findTestObject('Checkout/Keranjang/NEW Perbaharui Keranjang'), 0, FailureHandling.CONTINUE_ON_FAILURE)
    } else {
        TigaProduk
    }
}

