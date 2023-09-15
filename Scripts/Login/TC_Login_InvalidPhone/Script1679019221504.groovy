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

'Tap field Email/No. HP'
Mobile.tap(findTestObject('Login/Field Email or Nomor HP'), 0)

'input Nomor HP yang tidak terdaftar'
Mobile.setText(findTestObject('Login/Field Email or Nomor HP'), '1234567891011', 0)

'Tap field Password'
Mobile.tap(findTestObject('Login/Field Password'), 0)

'Input Password'
Mobile.setText(findTestObject('Login/Field Password'), GlobalVariable.PASSWORD, 0)

'Tap icon mata tertutup'
Mobile.tap(findTestObject('Login/Icon Password'), 0)

'Tap tombol Login'
Mobile.tap(findTestObject('Login/Tombol Login'), 0)

Mobile.waitForElementPresent(findTestObject('Login/Alert Email atau Nomor HP Salah'), 0)

Mobile.verifyElementVisible(findTestObject('Login/Alert Email atau Nomor HP Salah'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Invalid Phone Login.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Tutup\' pada alert Email/No. Hp tidak terdaftar'
Mobile.tap(findTestObject('Login/Close Gagal Login'), 0)

'Tap field Email/No. HP'
Mobile.tap(findTestObject('Object Repository/Login/InvalidPhone/Data Field Nomor HP Salah'), 0)

'Hapus data Nomor HP'
Mobile.clearText(findTestObject('Login/InvalidPhone/Data Field Nomor HP Salah'), 0)

'Tap field Password'
Mobile.tap(findTestObject('Login/Data Password Benar'), 0)

'Hapus data Password'
Mobile.clearText(findTestObject('Login/Data Password Benar'), 0)

