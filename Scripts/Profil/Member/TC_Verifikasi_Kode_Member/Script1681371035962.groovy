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

'Tap tombol \'Verifikasi\' pada laman Verifikasi Akun'
Mobile.tap(findTestObject('Profil/Member/Tombol Verifikasi Kode Member'), 0)

'Tap tombol \'Oke\' pada alert belum verifikasi member'
Mobile.tap(findTestObject('Profil/Member/OK Peringatan belum verifikasi akun'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Alert Verifikasi Kode Member.png', FailureHandling.CONTINUE_ON_FAILURE)

'Pastikan muncul alert verifikasi member'
Mobile.verifyElementExist(findTestObject('Profil/Member/Alert Verifikasi Kode Member'), 0)

'Tap tombol \'Verifikasi\' pada laman Kode Member'
Mobile.tap(findTestObject('Profil/Member/Verifikasi Kode Member'), 0)

'Tap \'Benefit Member\''
Mobile.tap(findTestObject('Profil/Member/Benefit Member'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Profil/Member/Back Verifikasi Akun'), 0)

Mobile.tap(findTestObject('Profil/Member/Back Verifikasi Akun'), 0)

'Tap \'Verifikasi\' pada alert belum lakukan verifikasi kode member'
Mobile.tap(findTestObject('Profil/Member/Setuju Verifikasi Member'), 0)

Mobile.tap(findTestObject('Profil/Member/Back Verifikasi Akun'), 0)

'Tap \'Tidak\' pada alert belum lakukan verifikasi kode member'
Mobile.tap(findTestObject('Profil/Member/Batal Verifikasi Member'), 0)

