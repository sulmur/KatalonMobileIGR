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

'Tap tombol \'Hapus\' pada salah satu produk'
Mobile.tap(findTestObject('Checkout/Keranjang/Icon Hapus Produk'), 0)

if (Mobile.verifyElementExist(findTestObject('Checkout/Keranjang/Stok Habis/Jumlah Produk Habis'), 0, FailureHandling.OPTIONAL)) {
	Mobile.waitForElementPresent(findTestObject('Checkout/Keranjang/Stok Habis/Jumlah Produk Habis'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	'checklist hapus produk baris 1'
	Mobile.tap(findTestObject('Checkout/Keranjang/Stok Habis/Checklist Produk Habis 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
	
	'checklist hapus produk baris 2'
	Mobile.tap(findTestObject('Checkout/Keranjang/Stok Habis/Checklist Produk Habis 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)
} else {
	Mobile.waitForElementPresent(findTestObject('Checkout/Keranjang/Checklist Hapus Produk 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	'checklist hapus produk baris 1'
	Mobile.tap(findTestObject('Checkout/Keranjang/Checklist Hapus Produk 1'), 0, FailureHandling.CONTINUE_ON_FAILURE)
	
	Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)
	
	'checklist hapus produk baris 2'
	Mobile.tap(findTestObject('Checkout/Keranjang/Checklist Hapus Produk 2'), 0, FailureHandling.CONTINUE_ON_FAILURE)	
}

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap \'Hapus\' pada bagian navbar'
Mobile.tap(findTestObject('Checkout/Keranjang/Setuju Hapus Checklist Produk'), 0)

'Tap \'Ya\' pada pop-up konfirmasi hapus produk'
Mobile.tap(findTestObject('Checkout/Keranjang/Setuju Hapus Produk'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Hapus semua produk.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

