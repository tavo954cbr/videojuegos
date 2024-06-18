package com.videojuegos.videojuegos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.videojuegos.videojuegos.domain.Videojuego;

@Service

public class VideojuegoService {
    public List<Videojuego> buscarDestacados(){
        List<Videojuego> destacados = new ArrayList<>();

    Videojuego juego = new Videojuego();
    juego.setNombre("Dark Souls");
    juego.setDescripcion("Dark Souls es un videojuego de rol de acción, desarrollado por la empresa From Software para las plataformas PlayStation 3, PlayStation 4, Xbox 360 y Microsoft Windows, distribuido por Namco Bandai Games. Anteriormente conocido como Project Souls, es el segundo videojuego de la serie Souls");
    juego.setImagenUrl("https://static.bandainamcoent.eu/high/dark-souls/dark-souls-1/00-page-setup/ds1_game_thumb_408x314.jpg");
    destacados.add(juego);

    juego = new Videojuego();
    juego.setNombre("War Zone");
    juego.setDescripcion("Te damos la bienvenida a Call of Duty®: Warzone™, la enorme arena de combate gratuita que ahora cuenta con los mapas Urzikstan, Isla Renacimiento y Torreón de la fortuna.\r\n" + //
                "\r\n" + //
                "Sube la temperatura\r\n" + //
                "Prepárate para luchar en Urzikistán, este nuevo y enorme mapa Battle Royale que comprende una ciudad. Regresa Isla Renacimiento y Torreón de la fortuna, dos mapas de Resurgimiento que emocionará a los veterano y a los nuevos jugadores.\r\n" + //
                "\r\n" + //
                "Saquea para conseguir recompensas\r\n" + //
                "Descubre cajas de suministros y completa contratos para construir tu arsenal y obtener una ventaja táctica.\r\n" + //
                "\r\n" + //
                "No se requiere una suscripción a Game Pass Core para jugar al modo de juego Call of Duty®: Warzone™. Todos los demás modos en línea aún requieren Game Pass Core.");
    juego.setImagenUrl("https://i.blogs.es/7facfa/wzm-globalrelease-tout/500_333.jpeg");
    destacados.add(juego);

    juego = new Videojuego();
    juego.setNombre("League of Legends");
    juego.setDescripcion("League of Legends es un videojuego multijugador de arena de batalla en línea desarrollado y publicado por Riot Games. Inspirándose en Defense of the Ancients, un mapa personalizado para Warcraft III, los fundadores de Riot buscaron desarrollar un juego independiente del mismo género.");
    juego.setImagenUrl("https://cdn1.epicgames.com/offer/24b9b5e323bc40eea252a10cdd3b2f10/EGS_LeagueofLegends_RiotGames_S1_2560x1440-80471666c140f790f28dff68d72c384b");
    destacados.add(juego);

    juego = new Videojuego();
    juego.setNombre("Forza Motorsport");
    juego.setDescripcion("Sumérgete en más de 500 automóviles reales distribuidos en 20 circuitos famosos alrededor del mundo, incluyendo las ubicaciones favoritas de los fans y múltiples recorridos, cada uno de ellos con una hora del día totalmente dinámica, con condiciones meteorológicas y de conducción únicas.\r\n" + //
                "Supera a tus rivales usando más de 800 actualizaciones de rendimiento en la nueva, divertida y gratificante experiencia para un solo jugador, el modo Builders Cup Career.\r\n" + //
                "Compite junto con tus amigos en eventos multijugador con estrategia de neumáticos y combustible, una estructura inspirada en los fines de semana de carreras y nuevas clasificaciones de pilotos y seguridad.\r\n" + //
                "Compite con oponentes IA de vanguardia, mecánica avanzada, efectivas asistencias, nuevos sistemas de daños y acumulación de polvo, así como efectos visuales fotorrealistas con ray tracing en vivo sobre la pista.");
    juego.setImagenUrl("https://assets.xboxservices.com/assets/a0/b4/a0b4f039-0d89-48d8-afb2-05a7411b6ee6.jpg?n=Forza-Motorsport_GLP-Page-Hero-0_1083x1222_02.jpg");
    destacados.add(juego);

    juego = new Videojuego();
    juego.setNombre("Halo 5 Guardians");
    juego.setDescripcion("Halo 5 Guardians es un videojuego de disparos en primera persona de la popular saga de videojuegos Halo exclusivo para la consola Xbox One, el cual salió el 27 de octubre de 2015 desarrollado por 343 Industries y publicado por Microsoft Studios. El juego sigue la línea argumental de Halo 4.");
    juego.setImagenUrl("https://media.gq.com.mx/photos/5be9f2138021583cae66fd92/master/pass/halo_5_2099.jpg");
    destacados.add(juego);

        return destacados;
    }
}
