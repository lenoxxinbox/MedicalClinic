package ru.medical.clinic;

// Создаем класс "Пациент"
class Patient {
    int assignedPlan; // Объявляем переменную "назначенный план" с типом int
    Doctor doctor; // Объявляем переменную "Врач" с типом Doctor

    // Создаем метод "Назначить план"
    void setAssignedPlan(int plan) {
        this.assignedPlan = plan; // Присваиваем значение параметра plan текущего объекта класса "Пациент"
    }

    // Создаем метод "Назначить доктора"
    void assignDoctor() {
        if (assignedPlan == 1) { // Если назначен план, равный 1, то назначить врачом Хирурга
            doctor = new Surgeon();
        } else if (assignedPlan == 2) { // Если назначен план, равный 2, то назначить врачом Дантиста
            doctor = new Dentist();
        } else { // Во всех остальных случаях, если назначен план, не равный 1 или 2, то назначить врачом Терапевта
            doctor = new Therapist();
        }
        doctor.toHeal(); // После назначения врача в соответствии с планом вызываем у назначенного врача метод "Лечить"
    }
}
