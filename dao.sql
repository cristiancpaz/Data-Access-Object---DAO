PGDMP             
            y            dao    12.3    12.3                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            	           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    19156    dao    DATABASE     ?   CREATE DATABASE dao WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE dao;
                postgres    false            ?            1259    19157    contato    TABLE     Y   CREATE TABLE public.contato (
    id integer NOT NULL,
    nome character varying(50)
);
    DROP TABLE public.contato;
       public         heap    postgres    false            ?            1259    19177    endereco    TABLE     ?   CREATE TABLE public.endereco (
    id integer NOT NULL,
    id_contato integer,
    numero integer,
    bairro character varying(50),
    logradouro character varying(50),
    complemento character varying(50)
);
    DROP TABLE public.endereco;
       public         heap    postgres    false                      0    19157    contato 
   TABLE DATA           +   COPY public.contato (id, nome) FROM stdin;
    public          postgres    false    202   5                 0    19177    endereco 
   TABLE DATA           [   COPY public.endereco (id, id_contato, numero, bairro, logradouro, complemento) FROM stdin;
    public          postgres    false    203   e       ?
           2606    19161    contato contato_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.contato
    ADD CONSTRAINT contato_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.contato DROP CONSTRAINT contato_pkey;
       public            postgres    false    202            ?
           2606    19181    endereco endereco_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT endereco_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.endereco DROP CONSTRAINT endereco_pkey;
       public            postgres    false    203            ?
           2606    19182 !   endereco endereco_id_contato_fkey    FK CONSTRAINT     ?   ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT endereco_id_contato_fkey FOREIGN KEY (id_contato) REFERENCES public.contato(id);
 K   ALTER TABLE ONLY public.endereco DROP CONSTRAINT endereco_id_contato_fkey;
       public          postgres    false    202    2690    203                   x?3?L.?,.?L??2?,?Oή?????? ]??         B   x?3?4?4΢Ң?΢????ļ?T????D.c????Ɯ?@???Z?Eٜ?%?\1z\\\ ??     