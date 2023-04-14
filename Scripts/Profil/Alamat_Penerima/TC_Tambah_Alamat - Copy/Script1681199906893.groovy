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

Mobile.startApplication(GlobalVariable.APP, false)

Mobile.tap(findTestObject('Profil/Profil_Button/Menu Akun'), 0)

Mobile.swipe(100, 450, 0, 0)

Mobile.tap(findTestObject('Profil/Alamat_Penerima/Alamat_Button/Menu Kelola Alamat Penerima'), 0)

'Tap tombol  \'Edit Alamat\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Edit Alamat 2'), 0)

'Tap field \'Label\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Label Alamat Filled'), 0)

Mobile.clearText(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Label Alamat Filled'), 0)

'Input data pada field \'Label\''
Mobile.setText(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Field Label'), 'Puja', 0)

'Tap field \'Alamat Lengkap\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Alamat Lengkap Filled'), 0)

Mobile.clearText(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Alamat Lengkap Filled'), 0)

'Input data pada field \'Alamat Lengkap\''
Mobile.setText(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Field Alamat Lengkap'), 'Jl. Ke Cikupa Jauh', 0)

'Tap field \'Provinsi\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Provinsi Filled'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap opsi provinsi \'Banten\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Provinsi Banten'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap field \'Kota\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Kota Filled'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap opsi Kota \'Kabupaten Tangerang\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Kabupaten Tangerang'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap field \'Kecamatan\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Kecamatan Filled'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap opsi Kecamatan \'Kecamatan Cisauk\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Kecamatan Cisauk'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap field \'Kelurahan\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Kelurahan Filled'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap opsi Kelurahan \'Kelurahan Cisauk\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Kelurahan Cisauk'), 0)

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap field \'Nomor HP\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Nomor HP Filled'), 0)

Mobile.clearText(findTestObject('Profil/Alamat_Penerima/Edit Alamat/Field Nomor HP Filled'), 0)

'Input data pada field \'Nomor HP\''
Mobile.setText(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Field Nomor HP'), '081808195603', 0)

Mobile.pressBack()

Mobile.delay(1, FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Tandai Lokasi di Peta\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Tombol Tandai Lokasi'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(100, 400, 0, 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol \'Konfirmasi\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Konfirmasi Lokasi'), 0)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(100, 400, 0, 0)

'Tap tombol \'Simpan\''
Mobile.tap(findTestObject('Profil/Alamat_Penerima/Tambah Alamat/Tombol Simpan Alamat'), 0)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

