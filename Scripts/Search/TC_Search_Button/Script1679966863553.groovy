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

'Buka aplikasi Klik Indogrosir'
Mobile.startApplication(GlobalVariable.APP, false)

'Tap tombol \'Pesan Ulang\''
Mobile.tap(findTestObject('Search/Pesan Ulang/Pesan Ulang 1'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Tutup\' pada pop-up berhasil pesan ulang'
Mobile.tap(findTestObject('Search/Pesan Ulang/Tutup Pesan Ulang'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap menu \'Search\''
Mobile.tap(findTestObject('Search/Menu Search'), 0)

