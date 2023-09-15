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

'Tap field \'Password Baru\''
Mobile.tap(findTestObject('Profil/Ubah_Password/Field Password Baru'), 0)

'Input \'Password Baru\' dengan data berkarakter huruf saja'
Mobile.setEncryptedText(findTestObject('Profil/Ubah_Password/Field Password Baru'), '6Bq4HnJ3LgA=', 0)

'Tap icon \'Mata tertutup\''
Mobile.tap(findTestObject('Profil/Ubah_Password/Icon Password Baru'), 0)

'Tap field \'Ketik Ulang Password Baru\''
Mobile.tap(findTestObject('Profil/Ubah_Password/Field Konfirmasi Password Baru'), 0)

'Input \'Ketik Ulang Password Baru\' dengan data yang sama dengan \'Password Baru\''
Mobile.setEncryptedText(findTestObject('Profil/Ubah_Password/Field Konfirmasi Password Baru'), '6Bq4HnJ3LgA=', 0)

'Tap icon \'Mata tertutup\''
Mobile.tap(findTestObject('Profil/Ubah_Password/Icon Konfirmasi Password Baru'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Password hanya huruf.png')