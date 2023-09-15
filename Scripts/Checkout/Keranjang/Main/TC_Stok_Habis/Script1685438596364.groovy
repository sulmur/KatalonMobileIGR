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

Mobile.callTestCase(findTestCase('Checkout/Keranjang/TC_Pesan_Ulang_Favourite'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Favourite/Stock Habis/Edit Jumlah Produk Row 1 Jumlah 1'), 0)

Mobile.waitForElementPresent(findTestObject('Favourite/Stock Habis/Field Edit Produk 1 Mixagrip'), 0)

Mobile.tap(findTestObject('Favourite/Stock Habis/Field Edit Produk 1 Mixagrip'), 0)

Mobile.setText(findTestObject('Favourite/Stock Habis/Field Edit Produk 1 Mixagrip'), '9999', 0)

Mobile.tap(findTestObject('Checkout/Keranjang/Edit Produk/Simpan Edit Produk'), 0)

Mobile.tap(findTestObject('Checkout/Keranjang/NEW Perbaharui Keranjang'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Stok Habis.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Checkout/Keranjang/TC_Hapus_Checklist_Produk'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

