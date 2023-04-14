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

Mobile.startApplication(GlobalVariable.APP, false)

'Tap menu Akun'
Mobile.tap(findTestObject('Profil/Profil_Button/Menu Akun'), 0)

'Tap tombol \'Lupa Password?\''
Mobile.tap(findTestObject('Lupa_Password/Tombol Lupa Password'), 0)

'Tap tombol \'Kirim Link Reset\''
Mobile.tap(findTestObject('Lupa_Password/Tombol Kirim Link Reset'), 0)

'Tap field Email untuk Reset Password'
Mobile.tap(findTestObject('Lupa_Password/Field Email'), 0)

Mobile.setText(findTestObject('Lupa_Password/Field Email'), 'abc@gmail.com', 0)

'Input email yang terdaftar'
Mobile.setText(findTestObject('Lupa_Password/Field Email Aktif'), 'abc@gmail.com', 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Email.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Kirim Link Reset\''
Mobile.tap(findTestObject('Lupa_Password/Tombol Kirim Link Reset'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek gagal kirim Email.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Ok\' pada pop-up konfirmasi kirim email reset password'
Mobile.tap(findTestObject('Lupa_Password/OK'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

