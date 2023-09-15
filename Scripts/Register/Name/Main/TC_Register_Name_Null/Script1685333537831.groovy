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

Mobile.callTestCase(findTestCase('Register/Redirect_to_RegisterPage'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Email/TC_Register_ValidEmail'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Password/TC_Register_ValidPassword'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Address/TC_Register_ValidAddress'), [:], FailureHandling.CONTINUE_ON_FAILURE)

Mobile.callTestCase(findTestCase('Register/Phone_Number/TC_Register_ValidPhone'), [:], FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Daftar\' setelah mengisi form Register'
Mobile.tap(findTestObject('Register/Tombol Daftar'), 0)

Mobile.swipe(400, 400, 400, 1000)

Mobile.waitForElementPresent(findTestObject('Register/Name/Verify_Invalid_Name/Alert Nama Salah'), 0)

'Pastikan muncul alert "Nama minimal 3 huruf"'
Mobile.verifyElementVisible(findTestObject('Object Repository/Register/Name/Verify_Invalid_Name/Alert Nama Salah'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Null Name Result.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

