package br.com.alura.agenda;

import android.app.Application;

import br.com.alura.agenda.DAO.AlunoDAO;
import br.com.alura.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AlunoDAO dao = new AlunoDAO();
        dao.salva(new Aluno("andrio", "112223333", "andrio@gmail.com"));
        dao.salva(new Aluno("fran", "112223333", "fran@gmail.com"));

    }
}
