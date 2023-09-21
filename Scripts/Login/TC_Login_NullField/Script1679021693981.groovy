import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.awt.Color as Color
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

'Buka aplikasi Klik Indogrosir pada android'
Mobile.startExistingApplication(GlobalVariable.APP_EXIST, FailureHandling.CONTINUE_ON_FAILURE)

if (Mobile.waitForElementPresent(findTestObject('Kategori/Minuman'), 20, FailureHandling.OPTIONAL)) {

	'Klik menu akun'
	Mobile.tap(findTestObject('Profil/Profil_Button/Menu Akun'), 0)
	
	'Klik Login tanpa input field Email/No. HP dan Password'
	Mobile.waitForElementPresent(findTestObject('Login/Tombol Login'), 25)
	
} else {
	'Klik Login tanpa input field Email/No. HP dan Password'
	Mobile.waitForElementPresent(findTestObject('Login/Tombol Login'), 25)
}

'Klik Login tanpa input field Email/No. HP dan Password'
Mobile.tap(findTestObject('Login/Tombol Login'), 0)

Mobile.waitForElementPresent(findTestObject('Login/Alert Email harus diisi'), 25)

'Pastikan muncul alert \'Email atau nomor HP harus diisi!\''
Mobile.verifyElementVisible(findTestObject('Login/Alert Email harus diisi'), 0)

'Pastikan muncul alert \'Password harus diisi!\''
Mobile.verifyElementVisible(findTestObject('Login/Alert Password harus diisi'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Null Field Login.png', FailureHandling.CONTINUE_ON_FAILURE)

