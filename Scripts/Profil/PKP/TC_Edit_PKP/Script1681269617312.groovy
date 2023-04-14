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

'tap field \'Nama PKP\''
Mobile.tap(findTestObject('Profil/Data PKP/Nama PKP Filled - Sulthan Muhammad Raihan'), 0)

'Hapus text pada field \'Nama PKP\''
Mobile.clearText(findTestObject('Profil/Data PKP/Nama PKP Filled - Sulthan Muhammad Raihan'), 0)

'input data pada field \'Nama PKP\''
Mobile.setText(findTestObject('Profil/Data PKP/Field Nama PKP'), 'Sulthan Muhammad Raihan', 0)

'tap field \'Nomor PKP\''
Mobile.tap(findTestObject('Profil/Data PKP/Nomor PKP Filled - 42.494.842.7-676.785'), 0)

'Hapus text pada field \'Nomor PKP\''
Mobile.clearText(findTestObject('Profil/Data PKP/Nomor PKP Filled - 42.494.842.7-676.785'), 0)

'input data pada field \'Nomor PKP\''
Mobile.setText(findTestObject('Profil/Data PKP/Field Nomor PKP'), '42.494.842.7-676.785', 0)

'tap field \'Alamat Lengkap\''
Mobile.tap(findTestObject('Profil/Data PKP/Alamat Lengkap Filled - Flora Fauna'), 0)

'Hapus text pada field \'Alamat Lengkap\''
Mobile.clearText(findTestObject('Profil/Data PKP/Alamat Lengkap Filled - Flora Fauna'), 0)

'input data pada field \'Alamat Lengkap\''
Mobile.setText(findTestObject('Profil/Data PKP/Field Alamat Lengkap'), 'Flora Fauna', 0)

'tap tombol \'Simpan\' data PKP'
Mobile.tap(findTestObject('Profil/Data PKP/Tombol Simpan PKP'), 0)

'tap tombol \'Setuju\' pada pop-up Konfirmasi Simpan Data PKP'
Mobile.tap(findTestObject('Profil/Data PKP/Setuju Simpan PKP'), 0)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Berhasil simpan data PKP.png', FailureHandling.CONTINUE_ON_FAILURE)

'tap tombol \'OK\' pada pop-up berhasil Simpan Data PKP'
Mobile.tap(findTestObject('Profil/Data PKP/OK Berhasil Simpan'), 0)

