#include <iostream>
using namespace std;

// Clase Estudiante
class Estudiante {

private:

    string cedula;
    string nombre;
    string apellido;

    float nota1;
    float nota2;
    float nota3;

    float promedio;

public:

    // Constructor
    Estudiante(string c, string n, string a,
                float n1, float n2, float n3) {

        cedula = c;
        nombre = n;
        apellido = a;

        nota1 = n1;
        nota2 = n2;
        nota3 = n3;

        calcularPromedio();
    }

    // Método calcular promedio
    void calcularPromedio() {

        promedio = (nota1 + nota2 + nota3) / 3;
    }

    // Método estado
    string determinarEstado() {

        if (promedio >= 7) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }

    // Mostrar información
    void mostrarInformacion() {

        cout << "\n===== ESTUDIANTE =====" << endl;

        cout << "Cedula: " << cedula << endl;
        cout << "Nombre: " << nombre << endl;
        cout << "Apellido: " << apellido << endl;

        cout << "Nota 1: " << nota1 << endl;
        cout << "Nota 2: " << nota2 << endl;
        cout << "Nota 3: " << nota3 << endl;

        cout << "Promedio: " << promedio << endl;
        cout << "Estado: " << determinarEstado() << endl;
    }

    // Getter promedio
    float getPromedio() {
        return promedio;
    }
};

int main() {

    Estudiante* estudiantes[5];

    string cedula;
    string nombre;
    string apellido;

    float nota1;
    float nota2;
    float nota3;

    int aprobados = 0;
    int reprobados = 0;

    // Registro de estudiantes
    for (int i = 0; i < 5; i++) {

        cout << "\n===== REGISTRO DEL ESTUDIANTE "
             << i + 1 << " =====" << endl;

        cout << "Ingrese cedula: ";
        cin >> cedula;

        cout << "Ingrese nombre: ";
        cin >> nombre;

        cout << "Ingrese apellido: ";
        cin >> apellido;

        // Validación nota 1
        do {

            cout << "Ingrese nota 1: ";
            cin >> nota1;

            if (nota1 < 0 || nota1 > 10) {
                cout << "Nota invalida." << endl;
            }

        } while (nota1 < 0 || nota1 > 10);

        // Validación nota 2
        do {

            cout << "Ingrese nota 2: ";
            cin >> nota2;

            if (nota2 < 0 || nota2 > 10) {
                cout << "Nota invalida." << endl;
            }

        } while (nota2 < 0 || nota2 > 10);

        // Validación nota 3
        do {

            cout << "Ingrese nota 3: ";
            cin >> nota3;

            if (nota3 < 0 || nota3 > 10) {
                cout << "Nota invalida." << endl;
            }

        } while (nota3 < 0 || nota3 > 10);

        // Crear objeto
        estudiantes[i] = new Estudiante(
            cedula,
            nombre,
            apellido,
            nota1,
            nota2,
            nota3
        );

        // Contadores
        if (estudiantes[i]->getPromedio() >= 7) {
            aprobados++;
        } else {
            reprobados++;
        }
    }

    // Mostrar estudiantes
    cout << "\n===== LISTADO DE ESTUDIANTES =====" << endl;

    for (int i = 0; i < 5; i++) {

        estudiantes[i]->mostrarInformacion();
    }

    // Resultados finales
    cout << "\n===== RESULTADOS =====" << endl;

    cout << "Aprobados: "
         << aprobados << endl;

    cout << "Reprobados: "
         << reprobados << endl;

    return 0;
}
