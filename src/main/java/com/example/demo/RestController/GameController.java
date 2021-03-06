package com.example.demo.RestController;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.TsscGame;
import com.example.demo.Model.TsscStory;

public interface GameController {
	
	public void ActualizarGame(TsscGame game);
	public TsscGame AnadirGame(TsscGame gameOne) ;
	//public TsscGame AnadirGameSinTema(TsscGame gameOne);
	//public TsscGame AnadirGameJuego2(TsscGame gameOne) ;
	public TsscGame findGameById(long id);
	public List<TsscGame> findGameByDate(String date);
	//public boolean existbyId(long id);
	//public TsscStory agregarStory(TsscStory story,long id );
	public Iterable<TsscGame> findAlll();
	public Iterable<TsscStory> findHistorias();
	public TsscGame eliminarGame(long id);
	//public void actualizarGameDato(TsscGame game);

}
