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

Mobile.callTestCase(findTestCase('Profil/Alamat_Penerima/TC_Alamat_Button'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap \'Pilih Alamat Penerima\' baris kedua'
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Ganti_Alamat/Pilih Alamat 2'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Ganti Alamat.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap kembali \'Pilih Alamat Penerima\' baris pertama'
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Ganti_Alamat/Pilih Alamat 1'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Reset Pilihan Alamat.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

Mobile.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

