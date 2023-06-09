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

'Tap field Email/No. HP'
Mobile.tap(findTestObject('Login/Field Email or Nomor HP'), 0)

'Input Email yang valid'
Mobile.setText(findTestObject('Login/Field Email or Nomor HP'), 'raihansulthan4@gmail.com', 0)

'Tap field Password'
Mobile.tap(findTestObject('Login/Field Password'), 0)

'Input Password yang valid'
Mobile.setEncryptedText(findTestObject('Login/Field Password'), 'lsdNNXlVAZI=', 0)

'Tap icon \'mata tertutup\' pada field Password'
Mobile.tap(findTestObject('Login/Icon Password'), 0)

'Tap tombol Login'
Mobile.tap(findTestObject('Login/Tombol Login'), 0)

