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

'Tap field \'Provinsi\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Field Provinsi'), 0)

Mobile.waitForElementPresent(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Provinsi Banten'), 0)

'Tap opsi provinsi \'Banten\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Provinsi Banten'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap field \'Kota\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Field Kota'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap opsi Kota \'Kabupaten Tangerang\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Kabupaten Tangerang'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap field \'Kecamatan\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Field Kecamatan'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap opsi Kecamatan \'Kecamatan Cisauk\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Kecamatan Cisauk'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap field \'Kelurahan\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Field Kelurahan'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap opsi Kelurahan \'Kelurahan Cisauk\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Kelurahan Cisauk'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

