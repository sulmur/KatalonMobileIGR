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

'Buka Aplikasi Klik IGR'
Mobile.startExistingApplication(GlobalVariable.APP_EXIST)

Mobile.waitForElementPresent(findTestObject('Kategori/Ibu dan Anak'), 0, FailureHandling.STOP_ON_FAILURE)

'Tap menu Akun'
Mobile.tap(findTestObject('Object Repository/Aktivasi Email/Menu Akun'), 0, FailureHandling.STOP_ON_FAILURE)

'Tap tombol "Kirim Ulang Email Aktivasi"'
Mobile.tap(findTestObject('Object Repository/Aktivasi Email/Kirim Ulang Email Aktivasi'), 0, FailureHandling.STOP_ON_FAILURE)

'Tap field \'Email\''
Mobile.tap(findTestObject('Object Repository/Aktivasi Email/Field Email Aktivasi'), 0, FailureHandling.STOP_ON_FAILURE)

'Input email yang valid'
Mobile.setText(findTestObject('Aktivasi Email/Field Email Aktivasi'), 'sulthanraihan@ymail.com', 0, FailureHandling.STOP_ON_FAILURE)

'Tap tombol "Kirim Email Aktivasi"'
Mobile.tap(findTestObject('Object Repository/Aktivasi Email/Kirim Email Aktivasi'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Email Aktivasi.png', FailureHandling.STOP_ON_FAILURE)

'Tap tombol "Back"'
Mobile.tap(findTestObject('Object Repository/Aktivasi Email/Back Aktivasi Email'), 0)

'Tutup Aplikasi Klik IGR'
Mobile.closeApplication()

