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

Mobile.callTestCase(findTestCase('Profil/TC_Profil_Button'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profil/Ubah_Password/TC_UbahPassword_Button'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap field "Password Lama"'
Mobile.tap(findTestObject('Profil/Ubah_Password/Field Password Lama'), 0)

'Input Password Lama dengan data yang tidak valid'
Mobile.setEncryptedText(findTestObject('Profil/Ubah_Password/Field Password Lama'), 'WypC58UyQQPYI/WdHrNSTA==', 0)

'Tap icon "mata tertutup"'
Mobile.tap(findTestObject('Profil/Ubah_Password/Icon Password Lama'), 0)

Mobile.callTestCase(findTestCase('Profil/Ubah_Password/TC_PasswordBaru_Valid'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap tombol "Simpan Perubahan"'
Mobile.tap(findTestObject('Profil/Ubah_Password/Simpan Ubah Password'), 0)

Mobile.waitForElementPresent(findTestObject('Profil/Ubah_Password/Submit_Failed/Konfirmasi Password Invalid'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Password Lama Salah.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol "OK" pada alert konfirmasi password lama tidak sesuai'
Mobile.tap(findTestObject('Profil/Ubah_Password/Submit_Failed/Konfirmasi Password Invalid'), 0)

Mobile.waitForElementPresent(findTestObject('Profil/Ubah_Password/Simpan Ubah Password'), 0)

Mobile.tap(findTestObject('Profil/Ubah_Password/Back Ubah Password'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

