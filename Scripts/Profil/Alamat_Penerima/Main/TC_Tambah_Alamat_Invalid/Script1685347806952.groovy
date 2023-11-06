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

Mobile.callTestCase(findTestCase('Profil/Alamat_Penerima/Tambah Alamat/TC_Nama_Penerima_Valid'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profil/Alamat_Penerima/Tambah Alamat/TC_Alamat_Lengkap_Invalid'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profil/Alamat_Penerima/Tambah Alamat/TC_Address'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profil/Alamat_Penerima/Tambah Alamat/TC_Field_Nomor_HP'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Profil/Alamat_Penerima/Tambah Alamat/TC_Tandai_Lokasi'), [:], FailureHandling.STOP_ON_FAILURE)

'Tap tombol \'Simpan\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Tombol Simpan Alamat'), 0)

Mobile.waitForElementPresent(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Alert minimal alamat lengkap'), 0)

'Pastikan muncul alert \'Alamat Pengiriman minimal 10 karakter\' pada field Alamat Lengkap'
Mobile.verifyElementExist(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Alert minimal alamat lengkap'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Alert Alamat Lengkap.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

Mobile.delay(7, FailureHandling.CONTINUE_ON_FAILURE)

