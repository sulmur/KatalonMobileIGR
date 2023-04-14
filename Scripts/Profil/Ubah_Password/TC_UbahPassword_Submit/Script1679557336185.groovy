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

'Tap tombol "Simpan Perubahan"'
Mobile.tap(findTestObject('Profil/Ubah_Password/Simpan Ubah Password'), 0)

Mobile.verifyElementVisible(findTestObject('Profil/Ubah_Password/Ubah_Password_Submit/android.view.View'), 0)

'Pastikan muncul pop-up "Kata sandi berhasil diperbaharui"'
Mobile.verifyMatch('Kata sandi berhasil diperbaharui', 'Kata sandi berhasil diperbaharui', false)

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot(RunConfiguration.getReportFolder() + 'Cek Simpan Password Berhasil.png', FailureHandling.CONTINUE_ON_FAILURE)

'Tap tombol "Tutup" pada pop-up \'Password berhasil diperbaharui\''
Mobile.tap(findTestObject('Object Repository/Profil/Ubah_Password/Ubah_Password_Submit/android.widget.Button (1)'), 0)

