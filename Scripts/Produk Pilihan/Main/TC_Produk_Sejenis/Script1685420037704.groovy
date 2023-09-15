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

Mobile.swipe(100, 600, 0, 0)

Mobile.waitForElementPresent(findTestObject('Produk Pilihan/Produk Sejenis/Produk Sejenis Wafer Selamat'), 20)

'Tap gambar "Produk Sejenis" pada kolom 1'
Mobile.tap(findTestObject('Produk Pilihan/Produk Sejenis/Produk Sejenis Wafer Selamat'), 0)

Mobile.waitForElementPresent(findTestObject('Produk Pilihan/Produk Sejenis/Tab Promosi'), 20)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Produk Sejenis.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(100, 600, 0, 0)

Mobile.callTestCase(findTestCase('Produk Pilihan/TC_Tambah_Produk_Sejenis'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

