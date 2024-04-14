package ru.medical.clinic;

// Создаём класс "Терапевт"
class Therapist extends Doctor {
    @Override // Переопределяем метод "Лечить" из суперкласса для врача "Терапевт"
    public void toHeal() {
        System.out.println("Терапевт лечит пациента.");
    }
}
