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

Mobile.waitForElementPresent(findTestObject('Kategori/Ibu dan Anak'), 0)

'Tap tombol \'Pesan Ulang\''
Mobile.tap(findTestObject('Homepage/Pesan Ulang'), 0)

Mobile.waitForElementPresent(findTestObject('Homepage/Tutup Pop-up Pesan Ulang'), 0)

'Tap tombol \'Tutup\' pada pop-up berhasil pesan ulang'
Mobile.tap(findTestObject('Homepage/Tutup Pop-up Pesan Ulang'), 0)

Mobile.waitForElementPresent(findTestObject('Search/Menu Search'), 0)

'Tap menu \'Search\''
Mobile.tap(findTestObject('Search/Menu Search'), 0)
