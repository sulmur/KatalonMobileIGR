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
Mobile.tap(findTestObject('Register/Address/Dropdown Provinsi - Register'), 0)

'Pilih salah satu \'Provinsi\''
Mobile.tap(findTestObject('Register/Address/Register_ResetAddress/Opsi Provinsi -Banten-'), 0)

'Tap field \'Kota\''
Mobile.tap(findTestObject('Register/Address/Dropdown Kota - Register'), 0)

'Pilih salah satu \'Kota\''
Mobile.tap(findTestObject('Register/Address/Register_ResetAddress/Opsi Kota -Kabupaten Tangerang-'), 0)

'Tap field \'Kecamatan\''
Mobile.tap(findTestObject('Register/Address/Dropdown Kecamatan - Register'), 0)

'Pilih salah satu \'Kecamatan\''
Mobile.tap(findTestObject('Register/Address/Register_ResetAddress/Opsi Kecamatan -Cisauk-'), 0)

'Tap field \'Kelurahan\''
Mobile.tap(findTestObject('Register/Address/Dropdown Kelurahan - Register'), 0)

'Pilih salah satu \'Kelurahan\''
Mobile.tap(findTestObject('Register/Address/Register_ResetAddress/Opsi Kelurahan -Cisauk-'), 0)

'Tap kembali field \'Kota\' yang sudah dipilih'
Mobile.tap(findTestObject('Object Repository/Register/Address/Register_ResetAddress/Dropdown Kota -Kabupaten Tangerang-'), 0)

'Pilih \'Kota\' yang berbeda dari sebelumnya'
Mobile.tap(findTestObject('Object Repository/Register/Address/Register_ResetAddress/Opsi Kota -Kabupaten Pandeglang-'), 0)

