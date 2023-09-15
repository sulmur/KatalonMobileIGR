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

Mobile.callTestCase(findTestCase('Profil/TC_Profil_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profil/Saldo Klik/TC_Saldo_Button'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Saldo Klik/Lihat Semua'), 0)

'Tap tombol \'Lihat Semua\''
Mobile.tap(findTestObject('Saldo Klik/Lihat Semua'), 0)

Mobile.waitForElementPresent(findTestObject('Saldo Klik/Dana Masuk'), 0)

'Tap tombol \'Dana Masuk\''
Mobile.tap(findTestObject('Saldo Klik/Dana Masuk'), 0)

'Tap tombol \'Dana Keluar\''
Mobile.tap(findTestObject('Saldo Klik/Dana Keluar'), 0)

'Tap tombol \'Semua\''
Mobile.tap(findTestObject('Saldo Klik/Semua'), 0)

