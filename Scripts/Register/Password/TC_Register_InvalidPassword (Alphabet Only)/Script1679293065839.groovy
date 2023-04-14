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

'Tap field \'Password\''
Mobile.tap(findTestObject('Register/Password/Field Password - Register'), 0)

'Input Password dengan format yang salah (hanya huruf saja)'
Mobile.setEncryptedText(findTestObject('Register/Password/Field Password - Register'), '2Ch3tCa/S0s=', 0)

'Tap icon \'Mata tertutup\''
Mobile.tap(findTestObject('Register/Password/Icon Field Password'), 0)

'Tap field \'Konfirmasi Password\''
Mobile.tap(findTestObject('Register/Password/Field Konfirmasi Password - Register'), 0)

'Input Konfirmasi Password sama dengan field Password'
Mobile.setEncryptedText(findTestObject('Register/Password/Field Konfirmasi Password - Register'), '2Ch3tCa/S0s=', 0)

'Tap icon \'Mata tertutup\''
Mobile.tap(findTestObject('Register/Password/Icon Field Konfirmasi Password'), 0)

