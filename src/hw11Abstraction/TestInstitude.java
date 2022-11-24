package hw11Abstraction;

public class TestInstitude {

	public static void main(String[] args) {
		System.out.println("---Below Output from Columbia University Regular Class.---\n");
		ColumbiaUniversity cUniversity = new ColumbiaUniversity();
		cUniversity.biology();
		cUniversity.anatomyLab();
		cUniversity.hygiene();
		ColumbiaUniversity.addmission();
		cUniversity.mechanicalLab();
		cUniversity.biochemistyLab();
		ColumbiaUniversity.bioTechLab();
		cUniversity.cafeteria();
		cUniversity.maths();
		cUniversity.lawInfo();
		cUniversity.anthropology();
		cUniversity.computerLab();
		cUniversity.aeronauticalInfo();
		cUniversity.vocationalInfo();
		cUniversity.classSize();
		cUniversity.playGround();
		cUniversity.teacher();
		cUniversity.gymnasium();
		University.library();
		
		System.out.println("---Below Output is from Univeristy Interface---\n");
		University university = new ColumbiaUniversity();
		university.cafeteria();
		university.playGround();
		university.teacher();
		university.gymnasium();
		University.library();
		College college = new ColumbiaUniversity();
		college.commonRoom();
		college.laboratory();
		college.languageClub();
		college.dorm();
		College.studyRoom();
		Hospital hospital = new ColumbiaUniversity();
		hospital.emergencyRoom();
		hospital.surgeryRoom();
		hospital.cafeteria();
		hospital.morgue();
		Hospital.pharmacy();
		
		System.out.println("---Below Output from Medical School---\n");
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		medicalSchool.anatomyLab();
		medicalSchool.biochemistyLab();
		MedicalSchool.bioTechLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.maths();
		medicalSchool.mechanicalLab();
		medicalSchool.aeronauticalInfo();
		medicalSchool.computerLab();
		medicalSchool.anthropology();
		medicalSchool.lawInfo();
		
	}

}





